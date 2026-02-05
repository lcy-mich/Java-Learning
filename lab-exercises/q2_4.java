import java.util.HashMap;
import java.util.Map;

import utils.FileInput;
import utils.FileOutput;
import utils.Input;


class Dictionary {
    private HashMap<String, String> _dict;

    public Dictionary() {
        this._dict = new HashMap<>();
    }

    public boolean hasWord(String word) {
        return this._dict.containsKey(word);
    }

    // returns true if addword is successful, false if not.
    public void addWord(String word, String def) {
        this._dict.put(word, def);
    }

    public void removeWord(String word) {
        this._dict.remove(word);
    }

    public void updateDef(String word, String def) {
        this._dict.replace(word, def);
    }

    public String getDef(String word) {
        return this._dict.get(word);
    }

    public String serialise() {
        String ser = "";
        
        for (Map.Entry<String, String> dictEntry : this._dict.entrySet()) {
                ser = ser +
                    "«" + 
                        dictEntry.getKey() +
                    "»" +
                        dictEntry.getValue();
        }

        return ser;
    }

    public void deserialise(String serialDict) {
        String currentKey = "";
        String currentDef = "";

        boolean keyFlag = false;

        for (int i = 0; i < serialDict.length(); i++) {
            switch (serialDict.charAt(i)) {
                case '«':
                    keyFlag = true;
                    
                    this._dict.put(currentKey, currentDef);
                    currentKey = "";
                    currentDef = "";

                    continue;
                case '»':
                    keyFlag = false;
                    continue;
                default:
                    if (keyFlag) {
                        currentKey += serialDict.charAt(i);
                    }
                    currentDef += serialDict.charAt(i);
                    continue;
            }
        }
    }
}

abstract class Action{

    private String name;
    private String desc;

    public Action(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public abstract void doAction(Dictionary dictRef);
}

class Quit extends Action{
    public Quit() { super("Quit", "Quits the application"); }
    @Override
    public void doAction(Dictionary dictRef) {
        try (FileOutput file = new FileOutput("worddict.txt")) {
            file.writeString(dictRef.serialise());
            file.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.exit(0);
    }
}

class Search extends Action{
    public Search() { super("Search", "Gets word definition"); }
    @Override
    public void doAction(Dictionary dictRef) {

    }
}

class Menu{
    private Action[] actions;

    public Menu(Action... actions) {
        this.actions = new Action[actions.length];
        for (int i = 0; i < actions.length; i++) {
            this.actions[i] = actions[i];
        }
    }
    
}

public class q2_4 {
    public static void main(String[] args) {
        
    }
}