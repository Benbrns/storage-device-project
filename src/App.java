import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) throws Exception {
		StorageDevice storage = new StorageDevice(10, 5);

		System.out.println(">>Block size\n" + storage.blockSize() + "\n");
		System.out.println(">>Total block count\n" + storage.totalBlockCount() + "\n");
		System.out.println(">>Free block count\n" + storage.freeBlocksCount() + "\n");
		System.out.println(">>Unavailable block count\n" + storage.usedBlocksCount() + "\n");

		System.out.println(">>Allocated blocks\n" + storage.allocate(5) + "\n");
		System.out.println(">>Object\n" + storage.toString() + "\n");

		System.out.println(">>Allocated blocks\n" + storage.allocate(3) + "\n");
		System.out.println(">>Object\n" + storage.toString() + "\n");

		System.out.println(">>Allocated blocks\n" + storage.allocate(2) + "\n");
		System.out.println(">>Object\n" + storage.toString() + "\n");

		// System.out.println(">>Allocated blocks\n" + storage.allocate(1));

		List<Integer> blocksToFree1 = new ArrayList<>();
		blocksToFree1.add(1);
		blocksToFree1.add(2);
		blocksToFree1.add(3);
		System.out.println(">>Free blocks\n" + storage.free(blocksToFree1) + "\n");
		System.out.println(">>Object\n" + storage.toString() + "\n");

		List<Integer> blocksToFree2 = new ArrayList<>();
		blocksToFree2.add(0);
		blocksToFree2.add(4);
		blocksToFree2.add(5);
		blocksToFree2.add(6);
		blocksToFree2.add(7);
		blocksToFree2.add(8);
		blocksToFree2.add(9);
		System.out.println(">>Free blocks\n" + storage.free(blocksToFree2) + "\n");
		System.out.println(">>Object\n" + storage.toString() + "\n");
	}
}
