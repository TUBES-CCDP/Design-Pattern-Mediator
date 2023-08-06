public class Main {
    public static void main(String[] args) {
     Mediator mediator = new GambarMediator();
     
     BangunDatar lingkaran = new Lingkaran();
     BangunDatar persegi = new Persegi();
     
     mediator.tambahBangunDatar(lingkaran);
     mediator.tambahBangunDatar(persegi);
     
     mediator.gambarBangunDatar();
     }
 }