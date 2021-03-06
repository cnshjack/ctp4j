package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\u05b8\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\u0175\u013d\ufffd\ufffd\u05fd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:3455</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcRspQueryTradeResultBySerialField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcTradeCodeType */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcBankBrchIDType */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcFutureBranchIDType */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcTradeTimeType */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcBankSerialType */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9) 
	public CThostFtdcRspQueryTradeResultBySerialField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10) 
	public CThostFtdcRspQueryTradeResultBySerialField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public CThostFtdcRspQueryTradeResultBySerialField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(12) 
	public int ErrorID() {
		return this.io.getIntField(this, 12);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(12) 
	public CThostFtdcRspQueryTradeResultBySerialField ErrorID(int ErrorID) {
		this.io.setIntField(this, 12, ErrorID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(13) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcSerialType */
	@Field(14) 
	public int Reference() {
		return this.io.getIntField(this, 14);
	}
	/** C type : TThostFtdcSerialType */
	@Field(14) 
	public CThostFtdcRspQueryTradeResultBySerialField Reference(int Reference) {
		this.io.setIntField(this, 14, Reference);
		return this;
	}
	/** C type : TThostFtdcInstitutionTypeType */
	@Field(15) 
	public byte RefrenceIssureType() {
		return this.io.getByteField(this, 15);
	}
	/** C type : TThostFtdcInstitutionTypeType */
	@Field(15) 
	public CThostFtdcRspQueryTradeResultBySerialField RefrenceIssureType(byte RefrenceIssureType) {
		this.io.setByteField(this, 15, RefrenceIssureType);
		return this;
	}
	/** C type : TThostFtdcOrganCodeType */
	@Array({36}) 
	@Field(16) 
	public Pointer<Byte > RefrenceIssure() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : TThostFtdcReturnCodeType */
	@Array({7}) 
	@Field(17) 
	public Pointer<Byte > OriginReturnCode() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : TThostFtdcDescrInfoForReturnCodeType */
	@Array({129}) 
	@Field(18) 
	public Pointer<Byte > OriginDescrInfoForReturnCode() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(19) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(20) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 20);
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(21) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 21);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(22) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 22);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(23) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 23);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(24) 
	public double TradeAmount() {
		return this.io.getDoubleField(this, 24);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(24) 
	public CThostFtdcRspQueryTradeResultBySerialField TradeAmount(double TradeAmount) {
		this.io.setDoubleField(this, 24, TradeAmount);
		return this;
	}
	/** C type : TThostFtdcDigestType */
	@Array({36}) 
	@Field(25) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 25);
	}
	public CThostFtdcRspQueryTradeResultBySerialField() {
		super();
	}
	public CThostFtdcRspQueryTradeResultBySerialField(Pointer pointer) {
		super(pointer);
	}
}
