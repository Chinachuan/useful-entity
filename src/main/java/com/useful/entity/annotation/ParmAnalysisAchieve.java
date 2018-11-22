package com.useful.entity.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @ClassName: ParmAnalysisAchieve
 * @Description: TODO(注解的实现类) 
 * @author: Jiuchuan.Shi
 * @Date: 2018年11月22日 下午12:16:05
 */
public class ParmAnalysisAchieve implements ConstraintValidator<ParmAnalysis, Object>{

	@Override
	public void initialize(ParmAnalysis constraintAnnotation) {
		// TODO Auto-generated method stub
		System.out.println("正在初始化自定义注解...");
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		System.out.println("解析传入的参数==>" + value);
		System.out.println("打印涉及注解的上下文内容==>" + ReflectionToStringBuilder.toString(context,ToStringStyle.MULTI_LINE_STYLE));
		return false;
	}
	
}

