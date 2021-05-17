package com.skyrimod.riverwood;

import com.skyrimod.riverwood.exception.AaException;
import com.skyrimod.riverwood.exception.BbException;
import com.skyrimod.riverwood.exception.CcEaException;
import org.junit.Test;

/**
 * @Classname ExceptionTest
 * @Description
 * @author: suixin
 * @date: 2021/5/13
 */
public class ExceptionTest {
    @Test
    public void exceptionTest(){
        try {
            //throw new AaException("AaException extends Exception");
            throw new BbException("BbException extends RuntimeException");
            //throw new CcEaException("CcEaException extends AaException");
        }catch (RuntimeException e){
            System.out.println("catch Exception === "+e.getMessage());
        }
    }
}
