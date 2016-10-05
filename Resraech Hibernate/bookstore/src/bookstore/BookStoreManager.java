/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import org.hibernate.SessionFactory;
import java.util.*;
import org.hibernate.*;
import entities.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author NHA
 */

public class BookStoreManager {
    //Tao mot bien final sessionfactory la sf de quan ly cac session
    private final SessionFactory sf = HibernateUtil.getSessionFactory();
    
    
    //Quan he One To One
    //Xem chi tiet mot cuon sach bao gom ma so , ten sach, so trang , nha xuat ban
    public void viewDetaiBook() {
        try {

            //Khoi tao session va bat dau lam viec voi session do
            Session session = sf.openSession();
            session.beginTransaction();

            //Nhap ma so cua cuon sach muon xem chi tiet
            Scanner sc = new Scanner(System.in);
            System.out.println("Input ISBM book want view: ");
            int isbm = sc.nextInt();

            //Viet cau lenh HQL  de tim cuon sach do
            Query query = session.createQuery("From Book where isbm = :isbm");
            //set parameter cho isbm la isbm duoc nhap vao tu ban phim
            query.setParameter("isbm", isbm);
            //Dua book tim duoc vao trong list book bang phuong thuc list();
            List<Book> list = query.list();

            //in ra thong tin cua cuon sach va chi tiet cua cuon sach do thong qua ham getBoodetail()
            for (Book book : list) {
                System.out.println("ISBM: " + book.getIsbm() + " - Name: "
                        + book.getName() + " - Number page: " + book.getBookdetail().getNumpage()
                        + " - Publisher: " + book.getBookdetail().getPublisher());
            }
            //Sau khi thuc hien xong cau truy van thi nen dong session do lai
            session.close();
        } catch (Exception e) {
        }
    }

    //Them mot cuon sach va chi tiet cua cuon sach do
    public void addOneToOne() {
        try {
           //Tao session va bat dau lam viec voi session do
            Session session = sf.openSession();
            session.beginTransaction();

            //Tao mot cuon sach ten la lap trinh hava nang cao
            Book book = new Book("Lap Trinh Java nang cao");
            //Tao chi tiet cua cuon sach do vao va dua doi tuong book vua tao vao trong ham khoi tao cua bookdetail
            Bookdetail bookdetail = new Bookdetail(book, 100, "Nha xuat ban tre");

            //Dung phuong thuc save de luu doi tuong book va bookdetail vao 2 bang 
            session.save(book);
            session.save(bookdetail);
            session.getTransaction().commit();
            //Sau khi hoan thanh cong viec thi dong sesson lai
            session.close();
            System.out.println("Done");
        } catch (Exception e) {
        }
    }

    //Xoa mot book thi truoc tien phai xoa bookdetail cua no truoc
    public void removeOneToOne() throws IOException {
        try {
            //Tao 1 session va bat dau lam viec voi no
            Session session = sf.openSession();
            session.beginTransaction();

            //Nguoi dung se nhap ma so cuon sach can xoa
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input isbm book want delete: ");
            int isbm = Integer.parseInt(input.readLine());

            //Viet cau lenh HQL de xoa chi tiet cua cuon sach do
            String hql = "delete from Bookdetail where isbm=:isbm";
            Query query = session.createQuery(hql);
            //Set parameter choi cau lenh vua viet
            query.setParameter("isbm", isbm);
            //moi thay doi nhu create, update , delete phai dung executeUpdate() de thuc hien
            
            query.executeUpdate();
            //sau khi xoa chi tiet cuon sach thi moi xoa duoc cuon sach do
            hql = "delete from Book where isbm=:isbm";
            query = session.createQuery(hql);
            query.setParameter("isbm", isbm);
            query.executeUpdate();

            session.getTransaction().commit();
            //sau khi xoa thi dong session lai
            session.close();
            System.out.println("Done");
        } catch (Exception e) {
        }
    }

    //Quan he many to many
    //Xem danh sach nhung cuon sach cua 1 tac gia
    public void viewBookOfAuthor() throws IOException {
        try {
            //Nhap ten tac gia do vao
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input name author: ");
            String authorName = input.readLine();

            //tao session va bat dau lam viec voi session do
            Session session = sf.openSession();
            session.beginTransaction();
            
            //viet cau lenh hql de lay duoc tac gia vua tao
            Query query = session.createQuery("from Author where name = :name");
            //set parameter cho cau lenh HQL tren
            query.setParameter("name", authorName);
            //Dua tac gia vua tao vao 1 list tac gia bang phuong thuc list();
            List<Author> list = query.list();
            
            System.out.println("List Book of " + authorName + " is: ");
            //duyet ten nhung cuon sach cua tac gia do
            for (Author author : list) {
                Set<Book> setBook = author.getBooks();
                for (Book b : setBook) {
                    System.out.println(b.toString());
                }
            }
            session.close();
            System.out.println("DONE");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Many to Many
    //Xem nhung ai la tac gia cua cuon sach vua tim
    public void viewAuthorOfBook() throws IOException{
        try {
            //Nhap ma cuon sach do vao
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input isbm of book: ");
            int idbook = Integer.parseInt(input.readLine());
            //tao 1 session va bat dau lam viec voi session do
            Session session = sf.openSession();
            session.beginTransaction();

            //Viet cau lenh HQL de tim cuon sach theo ma cuon sach
            Query query = session.createQuery("from Book where isbm= :idbook");
            //Set parameter cho cau lenh tren
            query.setParameter("idbook", idbook);
            //dua ket qua cua cau lenh tren vao danh list book bang phuong thuc list()
            List<Book> list = query.list();
            System.out.println("List Author of Book is: ");
            //Duyet danh sachc cac tac gia cua cuon sach do bang phuong thuc getAuthor
            for (Book book : list) {
                Set<Author> setAuthors = book.getAuthors();
                for (Author a : setAuthors) {
                    System.out.println(a.toString());
                }
            }
            //Dong session lai sau khi xong viec
            session.close();
            System.out.println("DONE");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    //Many to many
    //Them vao cac tac pham va cac tac gia co quan he voi nhau
    public void addManyToMany() {
        try {
            //Tao session va bat dau lam viec voi session do
            Session session = sf.openSession();
            session.beginTransaction();

            //Tao cac cuon sach
            Book book1 = new Book("Tac Pham A");
            Book book2 = new Book("Tac Pham B");

            //Tao cac tac gia
            Author author1 = new Author("Tac Gia A");
            Author author2 = new Author("Tac Gia B");

            //Luu cac tac gia do vao database
            session.save(author1);
            session.save(author2);
            
            //tao cac quan he nhu la 1 cuon sach thi co nhieu tac gia va 1 tac gia thi co nhieu cuon sach
            book1.getAuthors().add(author1);
            book1.getAuthors().add(author2);
            book2.getAuthors().add(author1);

            //luu cac cuon sach lai
            session.save(book1);
            session.save(book2);
            
            session.getTransaction().commit();
            //sau khi hoan thanh thi dong session lai
            session.close();
            System.out.println("Done");
        } catch (Exception e) {
        }
    }
    
    //many to many
    //Demo xoa mot cuon sach
    public void deleteManyToMany() throws IOException {
        try {
            //Tao session va bat dau lam viec voi session do
            Session session = sf.openSession();
            session.beginTransaction();
            
            //nguoi dung nhap ma cuon sach muon xoa
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input ID Book want delete");
            int isbm = Integer.parseInt(input.readLine());

            //Viet cau lenh sql de xoa lien ket giua cuon sach voi tac gia trong bang bookauthor
            String sql = "delete from bookauthor where isbm = :isbm";
            SQLQuery query = session.createSQLQuery(sql);
            query.setParameter("isbm", isbm);
            query.executeUpdate();

            //Viet cau lenh xoa mot cuon sach co ma isbm vua nhap
            sql = "delete from book where isbm =:isbm";
            query = session.createSQLQuery(sql);
            //set paramete cho cau truy van tren
            query.setParameter("isbm", isbm);
            //dung executeUpdate() de thuc thi cau truy van
            query.executeUpdate();
            session.getTransaction().commit();
            //sau khi thuc hien xong cong viec thi dong session lai
            session.close();
            System.out.println("done");
//            hql = "delete from Book where isbm =:isbm";
//            q1 = session.createQuery(hql);
//            q1.setParameter("isbm", isbm);
//            q1.executeUpdate();

            session.getTransaction().commit();
            session.close();
            System.out.println("Done");
        } catch (Exception e) {
        }
    }
    
    //Crud hibernate
    //Tao mot category
    public void createCategory() throws IOException {
        try {
            //Nhap nguoi dung nhap ten cua category ty ban phim
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input name of new category: ");
            String name = input.readLine();

            //dung bien sf de tao ra 1 session bang phuong thuc openSession
            Session session = sf.openSession();
            //sau khi tao session thi dung phuong thuc beginTransaction() de cho session do bat dau lam viec
            session.beginTransaction();

            //Tao 1 category co ten duoc nhap tu ban phim
            Category category = new Category(name);

            //Dung phuong thuc save() de luu category vua tao vao bang category;
            session.save(category);
            //Sau do ta se commit cau lenh 
            session.getTransaction().commit();
            //Sau khi hoan thanh viec tao 1 category thi ta dong session do lai
            session.close();
            System.out.println("DONE");

        } catch (Exception e) {
        }
    }

    //Xoa 1 category
    public void removeCategory() {
        try {
            //nhap id cua category muon xoa vao
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input id category want delete: ");
            int catID = Integer.parseInt(input.readLine());

            //Khoi tao va cho sesion do bat dau lam viec
            Session session = sf.openSession();
            session.beginTransaction();

            //Viet cau truy van HQL de xoa 1 category dua vao id cua category do
            Query query = session.createQuery("delete from Category where categoryid = :id");
            //set parameter cho cau truy van do bang phuong thuc setParameter
            query.setParameter("id", catID);
            //Moi thay doi them, xoa, sua deu dung executeUpdate() de thuc hien
            query.executeUpdate();

            //sau khi hoan thanh cau lenh thi commit
            session.getTransaction().commit();
            //sau cung thi dong session do lai
            session.close();
            System.out.println("DONE");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Xem tat ca cac category hien co 
    public void viewListCategory() {
        try {

            //tao session va bat dau phien lam viec voi session do
            Session session = sf.openSession();
            session.beginTransaction();

            //Dung cau truy van hql de lay thong tin cua tat ca cac category co trong bang 
            String hql = "From Category";
            
            Query query = session.createQuery(hql);
            //Dua ket qua truy van ve thanh 1 list cac category bang phuong thuc list()
            List<Category> list = query.list();
            //duyet va in ra list category
            for (Category cat : list) {
                System.out.println(cat.toString());
            }
            //sau khi hoan thanh thi dong session do lai
            session.close();
        } catch (Exception e) {
        }
    }

    //update 1 category
    public void updateCategory() {
        try {
            //nguoi dung se nhap ma so cua category muon update
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input id category want update: ");
            int catID = Integer.parseInt(input.readLine());

            //khoi tao 1 session va bat dau phien lam viec voi session do 
            Session session = sf.openSession();
            org.hibernate.Transaction tx = session.beginTransaction();

            //o day minh thay ten cua category thanh lap trinh
            String hql = "Update Category set name = 'Kiem Hiep 4' where categoryid = :catid";
            Query query = session.createQuery(hql);
            //set parameter cho category do
            query.setParameter("catid", catID);

            //ket qua tra ve se la mot so nguyen , neu bang 1 thi la thanh cong , neu la 0nghia la that bai
            int result = query.executeUpdate();
            tx.commit();
            System.out.println(result);
            //dong session sau khi update
            session.close();
            System.out.println("done");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //One to many
    //xem trong category co nhung cuon sach nao
    public void viewListBookFromCategory() throws IOException {
        //Nhap id cua category muon xem
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input category ID: ");
        int catid = Integer.parseInt(input.readLine());

        //Tao mot session moi
        Session session = sf.openSession();
        //cho session do bat dau lam viec
        session.beginTransaction();

        //Tao truy van HQL de lay category co categoryid bang vs gia tri nhap vao tu ban phim
        Query query = session.createQuery("from Category where categoryid = :catid");
        //set parameter catid bang voi gia tri nhap vao tu ban phim
        query.setParameter("catid", catid);
        //Lay duoc mot list cac category thoa man dieu kien bang phuong thuc list()
        List<Category> list = query.list();
        //duyet danh sach list do
        for (Category cat : list) {
            //Lay duoc tap hop cac cuon sach co cung categoryid
            Set<Book> setBook = cat.getBooks();
            //In ra thong tin cua cac cuon sach do
            for (Book b : setBook) {
                System.out.println(b.toString());
            }
        }
        //sau khi hoan thanh xong cau truy van thi nen dong session lai
        session.close();

        System.out.println("DONE");
    }
    //them mot category moi va them nhung cuon sach thuoc category do
    public void addOneToMany() {
        try {
            //Tao sesion va bat dau lam viec voi session do
            Session session = sf.openSession();
            session.beginTransaction();

            //Tao 2 cuon sach moi 
            Book book1 = new Book("Truyen Kieu");
            Book book2 = new Book("Luc van tien");

            //Tao mot category moi 
            Category category = new Category("Tho");

            //Luu category do vao database
            session.save(category);

            //Set category co 2 cuon sach do hoac ta co the set list nhun cuon
            //sach vao 1 category qua phuong thuc setBook() cua categoyry
            book1.setCategory(category);
            book2.setCategory(category);

            //luu 2 cuon sach lai
            session.save(book1);
            session.save(book2);
            session.getTransaction().commit();
            //sau khi thuc hien xong thi dong session lai
            session.close();
            System.out.println("DONE");
        } catch (Exception e) {
        }
    }
    //Xoa mot category thi phai xoa tat ca nhung cuon sach thuoc category do
    public void removeCategoryOneToMany() throws IOException {
        try {
            //Tao mot session va bat dau lam viec voi session do
            Session session = sf.openSession();
            session.beginTransaction();

            //Nhap ma category muon xoa
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input ID Category Want Delete: ");
            int catid = Integer.parseInt(input.readLine());

            //Viet cau truy van HQL de xoa nhung cuon sach thuoc category can xoa
            String hql = "delete from Book where categoryid = :catid";
            Query query = session.createQuery(hql);
            //set parameter cho cau truy van do
            query.setParameter("catid", catid);
            //dung phuong thuc executeUpdate() de xoa nhung cuon sach thuoc category can xoa
            query.executeUpdate();

            //viet cau lenh HQL de xoa category co id ma nguoi dung nhap vao
            hql = "delete from Category where categoryid = :catid";
            Query q2 = session.createQuery(hql);
            //set parameter cho cau truy van do
            q2.setParameter("catid", catid);
            //Thuc thi cau lenh bang phuong thuc executeUpdate()
            q2.executeUpdate();
            session.getTransaction().commit();
            //Sau khi hoan thanh cong viec thi dong session lai
            session.close();
            System.out.println("Done");
        } catch (Exception e) {
        }
    }

   
    

}
