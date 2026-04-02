
public class App {
    public static void main(String[] args) throws Exception {
        StorageDevice storage = new StorageDevice(10, 5);
        
        System.out.println(">>Block size\n" + storage.blockSize());
        System.out.println(">>Total block count\n" + storage.totalBlockCount());
        System.out.println(">>Free block count\n" + storage.freeBlocksCount());
        System.out.println(">>Unavailable block count\n" + storage.usedBlocksCount());

        System.out.println(">>Allocated blocks\n" + storage.allocate(5));
        System.out.println(">>Allocated blocks\n" + storage.allocate(3));
        System.out.println(">>Allocated blocks\n" + storage.allocate(2));
        System.out.println(">>Allocated blocks\n" + storage.allocate(1));
    }
}
