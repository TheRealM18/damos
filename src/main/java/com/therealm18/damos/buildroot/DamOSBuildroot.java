package li.cil.sedna.buildroot;

import java.io.InputStream;

public final class DamOSBuildroot {
    public static InputStream getFirmware() {
        return DamOSBuildroot.class.getClassLoader().getResourceAsStream("generated/fw_jump.bin");
    }

    public static InputStream getLinuxImage() {
        return DamOSBuildroot.class.getClassLoader().getResourceAsStream("generated/Image");
    }

    public static InputStream getRootFilesystem() {
        return DamOSBuildroot.class.getClassLoader().getResourceAsStream("generated/rootfs.cramfs");
    }

    public static InputStream getBootFilesystem() {
        return DamOSBuildroot.class.getClassLoader().getResourceAsStream("generated/bootfs.squashfs");
    }
}
