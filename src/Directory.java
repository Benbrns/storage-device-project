import java.util.ArrayList;
import java.util.List;

public class Directory extends Entity{

  private List<Entity> children = new ArrayList<>();

  public Directory(StorageDevice storageDevice, String name) {
    super(storageDevice, name);
  }

  public void add(Entity entity) {
    children.add(entity);
  }

  @Override
  public int sizeInBlocks() {
    int total = 0;
    for (Entity child: children) {
      total += child.sizeInBlocks();
    }
    return total;
  }

  @Override
  public void clear() {
    for (Entity child: children) {
      child.clear();
    }
  }
}
