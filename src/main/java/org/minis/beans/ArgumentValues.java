package org.minis.beans;

import java.util.*;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/16 10:31
 */
public class ArgumentValues {
    private final Map<Integer, ArgumentValue> indexedArgumentValues = new HashMap<>(0);
    private final List<ArgumentValue> genericArgumentValues = new LinkedList<>();

    public ArgumentValues() {}

    private void addArgumentValue(Integer key, ArgumentValue newValue) {
        this.indexedArgumentValues.put(key, newValue);
    }

    public boolean hasIndexedArgumentValue(int index) {
        return this.indexedArgumentValues.containsKey(index);
    }

    public ArgumentValue getIndexedArgumentValue(int index) {
        return this.indexedArgumentValues.get(index);
    }

    private void addGenericArgumentValue(Object value, String type) {
        this.genericArgumentValues.add(new ArgumentValue(value, type));
    }

    private void addGenericArgumentValue(ArgumentValue newValue) {
        if (newValue.getName() != null) {
           for (Iterator<ArgumentValue> it = this.genericArgumentValues.iterator(); it.hasNext();) {
               ArgumentValue currentValue = it.next();
               if (newValue.getName().equals(currentValue.getName())) {
                   it.remove();
               }
           }
           this.genericArgumentValues.add(newValue);
        }
    }

    public ArgumentValue getGenericArgumentValue(String requiredName) {
        for (ArgumentValue valueHolder : this.genericArgumentValues) {
            if (valueHolder.getValue() != null && ) {

            }
        }
    }
}
