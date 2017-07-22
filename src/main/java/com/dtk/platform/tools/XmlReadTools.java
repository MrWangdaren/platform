package com.dtk.platform.tools;

import java.io.InputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @Description 读取XML文件
 * @author DL
 * @date 2017年6月15日 下午2:41:02
 */
public class XmlReadTools {

	private static Logger logger = LoggerFactory.getLogger(XmlReadTools.class);

	public static Element parseXmlFile(String xmlFileName) {
		Element element = null;
		try {
			InputStream input = XmlReadTools.class.getClassLoader().getResourceAsStream(xmlFileName);
			if (input == null) {
				throw new RuntimeException("读取文件" + xmlFileName + "失败或没有找到.");
			}
			SAXReader reader = new SAXReader();
			Document doc = reader.read(input);
			element = doc.getRootElement();
		} catch (Throwable th) {
			logger.error("分解文件" + xmlFileName + "失败.", th);
			if ((th instanceof RuntimeException))
				throw ((RuntimeException) th);
		}
		return element;
	}
}
