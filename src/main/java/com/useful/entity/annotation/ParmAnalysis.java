package com.useful.entity.annotation;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


/**
 * @ClassName: ParmAnalysis
 * @Description: TODO(自定义注解) 
 * @author: Jiuchuan.Shi
 * @Date: 2018年11月22日 下午2:38:37
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=ParmAnalysisAchieve.class)
public @interface ParmAnalysis{
		String message();
		Class<?>[] groups() default{ };
		Class<? extends Payload>[] payload() default{ };
}
