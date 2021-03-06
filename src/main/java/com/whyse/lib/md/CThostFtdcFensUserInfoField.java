package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * Fens\ufffd\u00fb\ufffd\ufffd\ufffd\u03e2<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:3945</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcFensUserInfoField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcLoginModeType */
	@Field(2) 
	public byte LoginMode() {
		return this.io.getByteField(this, 2);
	}
	/** C type : TThostFtdcLoginModeType */
	@Field(2) 
	public CThostFtdcFensUserInfoField LoginMode(byte LoginMode) {
		this.io.setByteField(this, 2, LoginMode);
		return this;
	}
	public CThostFtdcFensUserInfoField() {
		super();
	}
	public CThostFtdcFensUserInfoField(Pointer pointer) {
		super(pointer);
	}
}
