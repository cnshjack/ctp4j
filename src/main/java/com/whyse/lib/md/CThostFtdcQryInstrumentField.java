package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\u053c<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:1251</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcQryInstrumentField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcExchangeInstIDType */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(3) 
	public Pointer<Byte > ProductID() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcQryInstrumentField() {
		super();
	}
	public CThostFtdcQryInstrumentField(Pointer pointer) {
		super(pointer);
	}
}
