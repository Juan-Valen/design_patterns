package A12_proxy;

import java.sql.Date;

public interface IDocument {

    public String getUuid();

    public Date getCreationDate();

    public String getContent(User user) throws AccessDeniedException;
}
