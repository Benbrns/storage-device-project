import java.util.ArrayList;
import java.util.List;

public class File extends Entity {
  private List<Integer> usedBlocks = new ArrayList<>();

  public File(StorageDevice storageDevice, String name) {
    super(storageDevice, name);
  }

  public void grow(int blockCount) {
    List<Integer> blocks = storage().allocate(blockCount);
    usedBlocks.addAll(blocks);
  }

  @Override
  public int sizeInBlocks() {
    return usedBlocks.size();
  }

  @Override
  public void clear(){
    storage().free(usedBlocks);
    usedBlocks.clear();
  }
}
