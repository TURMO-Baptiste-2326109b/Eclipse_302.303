package Tp2;

public class SLinkedList {
    private Node head; // Tête de la liste
    private int size;  // Nombre d'éléments dans la liste

    public SLinkedList() {
        head = null;
        size = 0;
    }

    // 1. CREATE - Ajouter un élément en début de la liste
    public void addFirst(int element) {
        head = new Node(element, head);
        size++;
    }

    // 2. READ - Afficher la liste de manière récursive
    public void printList(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        System.out.println(currentNode.getElement());
        printList(currentNode.getNext());
    }

    public void printList() {
        printList(head);
    }

    // 3. UPDATE - Modifier l'élément à une position donnée
    public boolean updateElement(int oldValue, int newValue) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getElement() == oldValue) {
                currentNode.setElement(newValue);
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    // 4. DELETE - Supprimer le premier élément
    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("La liste est vide.");
        }
        int removedElement = head.getElement();
        head = head.getNext();
        size--;
        return removedElement;
    }

    // Obtenir la taille de la liste
    public int getSize() {
        return size;
    }


    // Trouver l'avant-dernier nœud
    public Node findPenultimate() {
        if (head == null || head.getNext() == null) {
            throw new IllegalStateException("La liste doit contenir au moins deux éléments.");
        }

        Node currentNode = head;
        while (currentNode.getNext().getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    //1.4
    // Inverser les éléments de la liste
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.getNext(); // Sauvegarder le nœud suivant
            current.setNext(previous); // Inverser le lien
            previous = current; // Avancer le pointeur previous
            current = next; // Avancer le pointeur current
        }
        head = previous; // Mettre à jour la tête de la liste
    }
    //1.5
    public void swap(int x, int y){

        int z =  x;
        x =  y;
        y =  z;

    }

    //1.6


}





