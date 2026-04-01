package A12_proxy;

import java.util.HashMap;
import java.util.Map;

class Library {
    private Map<String, IDocument> documents = new HashMap<>();

    public void addDocument(IDocument doc) {
        documents.put(doc.getUuid(), doc);
    }

    public IDocument getDocument(String uuid) {
        return documents.get(uuid);
    }

}
