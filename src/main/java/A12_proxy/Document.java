package A12_proxy;

import java.sql.Date;

class Document implements IDocument {
    private String uuid;
    private Date creationDate;
    private String content;

    public Document(String uuid, String content) {
        this.uuid = uuid;
        this.creationDate = new Date(System.currentTimeMillis());
        this.content = content;
    }

    public String getUuid() {
        return uuid;
    };

    public Date getCreationDate() {
        return creationDate;
    };

    public String getContent(User user) {
        return content;
    };

    public void setContent(String content) {
        this.content = content;
    };

}
