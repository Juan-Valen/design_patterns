package A12_proxy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccessControlService {
    private final Map<String, Set<String>> permissions = new HashMap<>();

    public Boolean isAllowed(String uuid, String username) {
        return permissions.containsKey(uuid) && permissions.get(uuid).contains(username);
    }

    public void allowUser(String uuid, String username) {
        permissions.computeIfAbsent(uuid, k -> new HashSet<>()).add(username);
    }

}
