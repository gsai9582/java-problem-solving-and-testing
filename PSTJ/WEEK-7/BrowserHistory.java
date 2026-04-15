import java.util.*;

class BrowserHistory {
    List<String> list = new ArrayList<>();
    int index = 0;

    public BrowserHistory(String homepage) {
        list.add(homepage);
    }

    public void visit(String url) {
        while(list.size() > index+1) list.remove(list.size()-1);
        list.add(url);
        index++;
    }

    public String back(int steps) {
        index = Math.max(0, index - steps);
        return list.get(index);
    }

    public String forward(int steps) {
        index = Math.min(list.size()-1, index + steps);
        return list.get(index);
    }
}