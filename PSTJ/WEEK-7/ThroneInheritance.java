import java.util.*;

class ThroneInheritance {
    Map<String, List<String>> tree = new HashMap<>();
    Set<String> dead = new HashSet<>();
    String king;

    public ThroneInheritance(String kingName) {
        king = kingName;
        tree.put(king, new ArrayList<>());
    }

    public void birth(String parent, String child) {
        tree.putIfAbsent(parent, new ArrayList<>());
        tree.get(parent).add(child);
        tree.put(child, new ArrayList<>());
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getOrder() {
        List<String> res = new ArrayList<>();
        dfs(king, res);
        return res;
    }

    private void dfs(String curr, List<String> res) {
        if(!dead.contains(curr)) res.add(curr);
        for(String child : tree.get(curr)) {
            dfs(child, res);
        }
    }
}