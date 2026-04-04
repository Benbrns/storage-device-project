public abstract class Entity {
  private StorageDevice storageDevice;
  private String name;

  public Entity(StorageDevice storageDevice, String name) {
    this.storageDevice = storageDevice;
    setName(name);
  }

  public boolean isValidName(String name) {
    if (name.length() < 1 || name.length() > 16) {
     throw new IllegalArgumentException("Name is not valid");
    }
    return true;
  }

  public void setName(String name) {
    isValidName(name);
    this.name = name;
  }

  public StorageDevice storage() {
    return storageDevice;
  }

  public abstract int sizeInBlocks();
  public abstract void clear();

  public int sizeInBytes() {
    return sizeInBlocks() * storageDevice.blockSize();
  }

  @Override
  public String toString() {
    return "Entity [storageDevice=" + storageDevice + ", name=" + name + "]";
  }
}
