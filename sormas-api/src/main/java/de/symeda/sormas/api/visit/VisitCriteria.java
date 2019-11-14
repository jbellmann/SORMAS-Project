package de.symeda.sormas.api.visit;

import java.io.Serializable;

import de.symeda.sormas.api.BaseCriteria;
import de.symeda.sormas.api.contact.ContactReferenceDto;
import de.symeda.sormas.api.utils.IgnoreForUrl;

public class VisitCriteria extends BaseCriteria implements Serializable {

	private static final long serialVersionUID = -4565935488912148448L;

	private ContactReferenceDto contact;
	private Boolean deleted = Boolean.FALSE;

	@IgnoreForUrl
	public ContactReferenceDto getContact() {
		return contact;
	}
	
	public VisitCriteria contact(ContactReferenceDto contact) {
		this.contact = contact;
		return this;
	}
	
	public VisitCriteria deleted(Boolean deleted) {
		this.deleted = deleted;
		return this;
	}
	
	public Boolean getDeleted() {
		return deleted;
	}
	
}
