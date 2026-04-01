
public class StorageDevice {

    private int blockCount;
    private int blockSize;

    // Free Blocks to use
    private int[] freeBlocks;
    // used blocks
    private int[] unavailableBlocks;

    public StorageDevice(int blockCount, int blockSize) {
        this.blockCount = blockCount;
        this.blockSize = blockSize;
        this.freeBlocks = initFreeBlocks(blockCount);
        this.unavailableBlocks = initUnavailableBlocks(blockCount);
    }

    //SETTERS
    public int[] initFreeBlocks(int blockCount) {
        int[] freeBlocks = new int[blockCount];
        for (int i = 0;i < blockCount;i++) {
            freeBlocks[i] = i;
        }
        return freeBlocks;
    }

    public int[] initUnavailableBlocks(int blockCount) {
        return new int[blockCount];
    }

    // GETTERS
    public int getBlockCount() {
        return this.blockCount;
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public int getFreeBlocksCount() {
        return this.freeBlocks.length;
    }

    public int getUnavailableBlocksCount() {
        return this.unavailableBlocks.length;
    }

}
