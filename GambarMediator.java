import java.util.ArrayList;
import java.util.List;

public class GambarMediator implements Mediator {
  private List<BangunDatar> BangunDatarList = new ArrayList<>();
  
  @Override
  public void tambahBangunDatar(BangunDatar bangunDatar) {
    bangunDatarList.add(bangunDatar);
  }
  
  @Override
  public void gambarBangunDatar() {
    for (BangunDatar bangunDatar : bangunDatarList) {
      bangunDatar.gambar();
    }
  }
}