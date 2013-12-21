package com.googlecode.jsonrpc4j;
import java.io.IOException;

/**
 * @author Alexander Makarov
 *
 */
public class RuntimeIoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RuntimeIoException(IOException cause) {
		super(cause);
	}
}
