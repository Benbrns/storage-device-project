public class App {
    public static void main(String[] args) throws Exception {
        StorageDevice storage = new StorageDevice(10, 5);
        
        System.out.println(">>Block size\n" + storage.getBlockSize());
        System.out.println(">>Total block count\n" + storage.getBlockCount());
        System.out.println(">>Free block count\n" + storage.getFreeBlocksCount());
        System.out.println(">>Unavailable block count\n" + storage.getUnavailableBlocksCount());
    }
}
