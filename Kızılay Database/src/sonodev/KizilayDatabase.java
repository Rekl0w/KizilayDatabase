/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonodev;

import java.util.Scanner;


/**
 *
 * @author Rekl0w
 */
public class KizilayDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        KanAlma kanA = new KanAlma();
        KanVerme kanV = new KanVerme();
        KanAlıcılar kanAlıcı = new KanAlıcılar();
        KanVericiler kanVerici = new KanVericiler();
        
        Node a = new Node("0 Rh +");
        Node b = new Node("0 Rh -");
        Node c = new Node("A Rh +");
        Node d = new Node("A Rh -");
        Node e = new Node("B Rh +");
        Node f = new Node("B Rh -");
        Node g = new Node("AB Rh +");
        Node h = new Node("AB Rh -");
        
        Node insan1 = new Node("12345678911, Batuhan Mintaş, 0 Rh -, HIV -, Hepatit -, Kan verici");
        Node insan2 = new Node("12345678912, Ayşe Uçar, 0 Rh +, HIV -, Hepatit -, Kan verici");
        Node insan3 = new Node("12345678913, Oğuzhan Dalgakıran, A Rh -, HIV -, Hepatit -, Kan verici");
        Node insan4 = new Node("12345678914, Sevim Atasoy, B Rh -, HIV -, Hepatit -, Kan verici");
        Node insan5 = new Node("12345678915, Buse Güler, A Rh +, HIV -, Hepatit -, Kan verici");
        Node insan6 = new Node("12345678916, Çağrı Ergün, B Rh +, HIV -, Hepatit +, Kan alıcı");
        Node insan7 = new Node("12345678917, Kemal Can Parlak, 0 Rh +, HIV +, Hepatit -, Kan alıcı");
        Node insan8 = new Node("12345678918, Eray Özkenar, AB Rh +, HIV -, Hepatit -, Kan alıcı");
        Node insan9 = new Node("12345678919, Samet Yılmaz, 0 Rh +, HIV +, Hepatit +, Kan alıcı");
        Node insan10 = new Node("12345678920, Meral Yaşar, B Rh -, HIV -, Hepatit -, Kan alıcı");
        

        kanA.insert(a,b);
        kanA.insert(a,a);
        kanA.insert(b,b);
        kanA.insert(c,a);
        kanA.insert(c,b);
        kanA.insert(c,c);
        kanA.insert(c,d);
        kanA.insert(d,b);
        kanA.insert(d,d);
        kanA.insert(e,a);
        kanA.insert(e,b);
        kanA.insert(e,e);
        kanA.insert(e,f);
        kanA.insert(f,b);
        kanA.insert(f,f);
        kanA.insert(g,a);
        kanA.insert(g,b);
        kanA.insert(g,c);
        kanA.insert(g,d);
        kanA.insert(g,e);
        kanA.insert(g,f);
        kanA.insert(g,g);
        kanA.insert(g,h);
        kanA.insert(h,b);
        kanA.insert(h,d);
        kanA.insert(h,f);
        kanA.insert(h,h);
        
        kanV.insert(a,a);
        kanV.insert(a,c);
        kanV.insert(a,e);
        kanV.insert(a,g);
        kanV.insert(b,a);
        kanV.insert(b,b);
        kanV.insert(b,c);
        kanV.insert(b,d);
        kanV.insert(b,e);
        kanV.insert(b,f);
        kanV.insert(b,g);
        kanV.insert(b,h);
        kanV.insert(c,c);
        kanV.insert(c,g);
        kanV.insert(d,c);
        kanV.insert(d,d);
        kanV.insert(d,g);
        kanV.insert(d,h);
        kanV.insert(e,e);
        kanV.insert(e,g);
        kanV.insert(f,e);
        kanV.insert(f,f);
        kanV.insert(f,g);
        kanV.insert(f,h);
        kanV.insert(g,g);
        kanV.insert(h,g);
        kanV.insert(h,h);
        
        kanVerici.insert(insan1,insan7);
        kanVerici.insert(insan1,insan8);
        kanVerici.insert(insan1,insan9);
        kanVerici.insert(insan1,insan10);
        kanVerici.insert(insan2,insan6);
        kanVerici.insert(insan2,insan7);
        kanVerici.insert(insan2,insan8);
        kanVerici.insert(insan2,insan9);
        kanVerici.insert(insan3,insan8);
        kanVerici.insert(insan4,insan6);
        kanVerici.insert(insan4,insan8);
        kanVerici.insert(insan4,insan10);
        kanVerici.insert(insan5,insan8);
        
        kanAlıcı.insert(insan6,insan1);
        kanAlıcı.insert(insan6,insan2);
        kanAlıcı.insert(insan6,insan4);
        kanAlıcı.insert(insan7,insan1);
        kanAlıcı.insert(insan7,insan2);
        kanAlıcı.insert(insan8,insan1);
        kanAlıcı.insert(insan8,insan2);
        kanAlıcı.insert(insan8,insan3);
        kanAlıcı.insert(insan8,insan4);
        kanAlıcı.insert(insan8,insan5);
        kanAlıcı.insert(insan9,insan1);
        kanAlıcı.insert(insan9,insan2);
        kanAlıcı.insert(insan10,insan1);
        kanAlıcı.insert(insan10,insan4);

        System.out.println("Yapmak istediğiniz işlemin numarasını giriniz.");
        System.out.println("1 - Kan alıcı / verici ekleme.");
        System.out.println("2 - Girilen kişilerin kan uyumunu öğrenme.");
        System.out.println("3 - Hangi kan grubu kimden kan alabileceğini veya verebileceğini öğrenme. ");
        System.out.println("4 - Tüm kan alma / verme ilişkisini görüntüleme.");
        
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
    
    if(sayi == 1){
        System.out.println("Eklemek istediğiniz kişinin TC kimlik numarasını, adını soyadını ve kan grubunu giriniz: ");
          String kisi = sc.nextLine();
          Node insan = new Node(kisi);
          System.out.println("Eklemek istediğiniz kişinin Hepatit testi sonucunu giriniz: (+ veya -)");
          String hepatitSonuc = sc.nextLine();
          boolean Hepatit = hepatitSonuc.equals("+");
          System.out.println("Eklemek istediğiniz kişinin HIV testi sonucunu giriniz: (+ veya -)");
          String HIVSonuc = sc.nextLine();
          boolean HIV = HIVSonuc.equals("+");
          System.out.println("Kişinin kan almak mı vermek mi istediğini yazınız: ('alıcı' veya 'verici')");
          String istek = sc.nextLine();
          
          if(istek.equals("verici")){
              if(Hepatit || HIV){
              System.out.println("Bu kişi kan verici olamaz.");
              kanAlıcı.insert(insan, insan1);
              kanAlıcı.traverse();
          }else{
                  System.out.println("Bu kişi kan verici olabilir.");
                  kanVerici.insert(insan, insan8);
                  kanVerici.traverse();
              }
        
          }else{
              System.out.println("Bu kişi kan alıcı olabilir.");
              kanAlıcı.insert(insan, insan1);
              kanAlıcı.traverse();
          }
             
    }else if(sayi == 2){
        System.out.println("Eklemek istediğiniz kişinin TC kimlik numarasını, adını soyadını ve kan grubunu giriniz: ");
          String kisi = sc.nextLine();
          Node insan = new Node(kisi);
          System.out.println("Eklemek istediğiniz kişinin Hepatit testi sonucunu giriniz: (+ veya -)");
          String hepatitSonuc = sc.nextLine();
          boolean Hepatit = hepatitSonuc.equals("+");
          System.out.println("Eklemek istediğiniz kişinin HIV testi sonucunu giriniz: (+ veya -)");
          String HIVSonuc = sc.nextLine();
          boolean HIV = HIVSonuc.equals("+");
          System.out.println("Kişinin kan almak mı vermek mi istediğini yazınız: ('alıcı' veya 'verici')");
          String istek = sc.nextLine();
          
          if(istek.equals("verici")){
              if(Hepatit || HIV){
              System.out.println("Bu kişi kan verici olamaz.");
               kanAlıcı.insert(insan, insan1);
               kanAlıcı.traverse();
          }else{
                  System.out.println("Bu kişi kan verici olabilir.");
                  kanVerici.insert(insan, insan8);
                  kanVerici.traverse();
              }
        
          }else{
              System.out.println("Bu kişi kan alıcı olabilir.");
              kanAlıcı.insert(insan, insan1);
              kanAlıcı.traverse();
          }
          System.out.println("Eklemek istediğiniz kişinin TC kimlik numarasını, adını soyadını ve kan grubunu giriniz: ");
          String kisi2 = sc.nextLine();
          Node insanYeni = new Node(kisi2);
          System.out.println("Eklemek istediğiniz kişinin Hepatit testi sonucunu giriniz: (+ veya -)");
          String hepatitSonuc2 = sc.nextLine();
          boolean Hepatit2 = hepatitSonuc2.equals("+");
          System.out.println("Eklemek istediğiniz kişinin HIV testi sonucunu giriniz: (+ veya -)");
          String HIVSonuc2 = sc.nextLine();
          boolean HIV2 = HIVSonuc2.equals("+");
          System.out.println("Kişinin kan almak mı vermek mi istediğini yazınız: ('alıcı' veya 'verici')");
          String istek2 = sc.nextLine();
          
          if(istek2.equals("verici")){
              if(Hepatit2 || HIV2){
              System.out.println("Bu kişi kan verici olamaz.");
               kanAlıcı.insert(insanYeni, insan1);
               kanAlıcı.traverse();
          }else{
                  System.out.println("Bu kişi kan verici olabilir.");
                  kanVerici.insert(insanYeni, insan8);
                  kanVerici.traverse();
              }
        
          }else{
              System.out.println("Bu kişi kan alıcı olabilir.");
              kanAlıcı.insert(insanYeni, insan1);
              kanAlıcı.traverse();
          }
        
    }else if(sayi == 3){
        kanA.traverse();
        kanV.traverse(); 
    }else if(sayi == 4){
        kanAlıcı.traverse();
        kanVerici.traverse();
    }
  


   
    }
}
    

