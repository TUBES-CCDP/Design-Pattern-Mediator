public interface BangunDatar {
    void gambar();
    void setMediator(Mediator mediator);
}

public class Lingkaran implements BangunDatar {
  private Mediator mediator;
  
  @Override
  public setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
  
  @Override
  public void gambar() {
    System.out.println("Gambar lingkaran");
  }
}

public class Persegi implements BangunDatar {
  private Mediator mediator;
  
  @Override
  public setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
  
  @Override
  public void gambar() {
    System.out.println("Gambar persegi");
  }
}