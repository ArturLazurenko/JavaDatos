public class HashNode<K,V> {
    public K Key;
    public V Value;
    public HashNode<K,V> next;

    public HashNode(K Key, V Value) {
        this.Key = Key;
        this.next = null;
        this.Value = Value;
    }

    }
