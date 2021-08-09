package com.skyrimod.riverwood.spel;

import lombok.SneakyThrows;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @ClassName SpelTest
 * @Description spel
 * @Author jdj
 * @Date 2021/8/9 下午2:58
 **/
public class SpELTest {
    @Test
    public void MapTest(){
        SpelExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        System.out.println(map);

        context.setVariable("map",map);
        parser.parseExpression("#map[a]").setValue(context,4);

        System.out.println(map);
    }
    @SneakyThrows
    @Test
    public void FunctionTest(){
        SpelExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();

        context.registerFunction("myFunc",Integer.class.getDeclaredMethod("parseInt", String.class));

        Integer value = parser.parseExpression("#myFunc('3')").getValue(context, Integer.class);
        System.out.println(value);

    }

    @SneakyThrows
    @Test
    public void ClassTest(){
        SpelExpressionParser parser = new SpelExpressionParser();

        Class value = parser.parseExpression("T(com.skyrimod.riverwood.spel.SpELTest)")
                .getValue(Class.class);

        System.out.println(value);

    }
    @Test
    public void test(){
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("('Hello' + ' World').concat(#end)");
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setRootObject("root");
        context.setVariable("end","!");

        System.out.println(expression.getValue(context));
        System.out.println(parser.parseExpression("#root").getValue(context,String.class));
        System.out.println(parser.parseExpression("#this").getValue(context,String.class));
    }
}
