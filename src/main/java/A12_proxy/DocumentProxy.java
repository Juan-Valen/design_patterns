package A12_proxy;

import java.sql.Date;

class DocumentProxy implements IDocument {
    private Document document;
    private AccessControlService accessControl;

    public DocumentProxy(String uuid, String content, AccessControlService acs) {
        this.document = new Document(uuid, content);
        this.accessControl = new AccessControlService();
        this.accessControl = acs;
    }

    public String getUuid() {
        return document.getUuid();
    };

    public Date getCreationDate() {
        return document.getCreationDate();
    };

    public String getContent(User user) throws AccessDeniedException {
        if (accessControl.isAllowed(document.getUuid(), user.getUsername())) {
            return document.getContent(user);
        }
        throw new AccessDeniedException(
                "User " + user.getUsername() + " is not allowed to access document " + document.getUuid());
    };

}
