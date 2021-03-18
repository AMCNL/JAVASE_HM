package com.itheima._myInterface_01;
/*
 * 类：
 *    不可以多继承，但是支持多层继承
 * 
 * 接口：
 *     可以多继承
 *     
 * 关系：
 *     类继承类，类实现接口，接口继承接口
 *     
 */
public interface ICD extends IUSB,ISD{
	public void ICDSave();

}
