package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u05a4\ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffd\u037f\u037b\ufffd\ufffd\ufffd\u03e2<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:3516</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcVerifyFuturePasswordAndCustInfoField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcIndividualNameType */
	@Array({51}) 
	@Field(0) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(1) 
	public byte IdCardType() {
		return this.io.getByteField(this, 1);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(1) 
	public CThostFtdcVerifyFuturePasswordAndCustInfoField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 1, IdCardType);
		return this;
	}
	/** C type : TThostFtdcIdentifiedCardNoType */
	@Array({51}) 
	@Field(2) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(3) 
	public byte CustType() {
		return this.io.getByteField(this, 3);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(3) 
	public CThostFtdcVerifyFuturePasswordAndCustInfoField CustType(byte CustType) {
		this.io.setByteField(this, 3, CustType);
		return this;
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(4) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(5) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(6) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 6);
	}
	public CThostFtdcVerifyFuturePasswordAndCustInfoField() {
		super();
	}
	public CThostFtdcVerifyFuturePasswordAndCustInfoField(Pointer pointer) {
		super(pointer);
	}
}