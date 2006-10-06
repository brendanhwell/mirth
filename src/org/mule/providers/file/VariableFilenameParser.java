package org.mule.providers.file;

import org.mule.providers.TemplateValueReplacer;
import org.mule.umo.provider.UMOMessageAdapter;

import com.webreach.mirth.model.MessageObject;

public class VariableFilenameParser implements FilenameParser {
	private MessageObject messageObject;
	private TemplateValueReplacer replacer = new TemplateValueReplacer();

	public MessageObject getMessageObject() {
		return messageObject;
	}

	public void setMessageObject(MessageObject messageObject) {
		this.messageObject = messageObject;
	}

	public String getFilename(UMOMessageAdapter adaptor, String pattern) {
		String filename = (String) adaptor.getProperty(FileConnector.PROPERTY_ORIGINAL_FILENAME);
		return replacer.replaceValues(pattern, messageObject, filename);
	}

}
