package SlinkedList;

public class SinglyLinkedListApp2 {
    public static void main(String[] args){
        SinglyLinkedList lk = new SinglyLinkedList();
        lk.insertAwal(100);
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAwal(50);
        lk.display();
        lk.insertAtPos(80, 2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
        
        
        System.out.println();
        System.out.println("Muhammad Farid Baehaqi");
    }
}