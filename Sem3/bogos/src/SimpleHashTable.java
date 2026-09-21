public class SimpleHashTable<K, V> {
    public HashNode<K,V>[] buckets;
    public int capacity;
    public int size;

    public SimpleHashTable(int capacity){
        this.capacity = capacity;
        this.buckets = new HashNode[capacity];
        this.size = 0;
    }
    
    public int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    public void put(K key, V value){
        int bucketIndex = getBucketIndex(key);
        HashNode<K,V> head = buckets[bucketIndex];
        HashNode<K,V> current = head;
        while (current != null) {
            if(current.Key.equals(key)){
                current.Value = value;
                return;
        }
        current = current.next;
    }
    size++;
    HashNode<K,V> newNode = new HashNode<>(key, value);
    newNode.next = head;
    buckets[bucketIndex] = newNode;
    }

    public V getV(K key){
        int bucketIndex = getBucketIndex(key);
        HashNode<K,V> actual = buckets[bucketIndex];
        while (actual != null) {
            if (actual.Key.equals(key)){
                return actual.Value;
            }
            actual = actual.next;
        }
        return null;

    }


    public void showTable(){
        for(int i = 0; i < capacity; i++){
            System.out.print("Producto "+ i +".");
            HashNode<K,V> current = buckets[i];
            if (current == null){
                System.out.println("No hay productos registrados");

            }else{
                System.out.print("-> ");
                while (current != null) {
                    System.out.print("["+current.Key+" : "+current.Value +"] -> ");
                    current = current.next;
                }
                System.out.println("null");
            }

        }

    }
}
