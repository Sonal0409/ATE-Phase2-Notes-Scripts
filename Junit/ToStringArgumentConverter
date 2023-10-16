package com.phase2.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class ToStringArgumentConverter extends SimpleArgumentConverter  {

	@Override
	protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
		// TODO Auto-generated method stub
        Assertions.assertEquals(String.class, targetType, "Can only convert to String");
        return String.valueOf(source);

	}

}
