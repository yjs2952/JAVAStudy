package algorithmStudy.doItJAVA.ch10;

import java.util.Comparator;

public class BinTree<K, V> {
    static class Node<K, V> {
        private K key;
        private V data;
        private Node<K, V> left;
        private Node<K, V> right;

        Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return data;
        }

        void print() {
            System.out.println(data);
        }
    }

    private Node<K, V> root;
    private Comparator<? super K> comparator = null;

    public BinTree() {
        root = null;
    }

    public BinTree(Comparator<? super K> c) {
        this();
        comparator = c;
    }

    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
    }

    public V search(K key) {
        Node<K, V> p = root;

        while (true) {
            if (p == null) {
                return null;
            }

            int cond = comp(key, p.getKey());

            if (cond == 0) {
                return p.getValue();
            } else if (cond < 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
    }

    public void addNode(Node<K, V> node, K key, V data) {
        int cond = comp(key, node.getKey());

        if (cond == 0) {
            return;
        } else if (cond < 0) {
            if (node.left == null) {
                node.left = new Node<>(key, data, null, null);
            } else {
                addNode(node.left, key, data);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(key, data, null, null);
            } else {
                addNode(node.right, key, data);
            }
        }
    }

    public void add(K key, V data) {
        if (root == null) {
            root = new Node<>(key, data, null, null);
        } else {
            addNode(root, key, data);
        }
    }

    public boolean remove(K key) {
        Node<K, V> p = root;
        Node<K, V> parent = parent = null;
        boolean isLeftChild = true;

        while (true) {
            if (p == null) {
                return false;
            }

            int cond = comp(key, p.getKey());

            if (cond == 0) {
                break;
            } else {
                parent = p;

                if (cond < 0) {
                    isLeftChild = true;
                    p = p.left;
                } else {
                    isLeftChild = false;
                    p = p.right;
                }
            }
        }

        if (p.left == null) {
            if (p == root) {
                root = p.right;
            } else if (isLeftChild) {
                parent.left = p.right;
            } else
                parent.right = p.right;
        } else if (p.right == null) {
            if (p == root) {
                root = p.left;
            } else if (isLeftChild) {
                parent.left = p.left;
            } else
                parent.right = p.left;
        } else {
            parent = p;
            Node<K, V> left = p.left;
            isLeftChild = true;

            while (left.right != null) {
                parent = left;
                left = left.left;
                isLeftChild = false;
            }

            p.key = left.key;
            p.data = left.data;

            if (isLeftChild) {
                parent.left = left.left;
            } else {
                parent.right = left.left;
            }
        }
        
        return true;
    }
}
