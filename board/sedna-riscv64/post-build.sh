#!/bin/sh
<<<<<<< HEAD
rm -f "$TARGET_DIR/var/lib/dpkg/info/.keep" "$TARGET_DIR/etc/bashrc.d/.keep" "$TARGET_DIR/etc/resolv.conf" "$TARGET_DIR/home/.keep" "$TARGET_DIR/etc/init.d/S40xorg"
=======
rm -f "$TARGET_DIR/etc/bashrc.d/.keep" "$TARGET_DIR/etc/resolv.conf" "$TARGET_DIR/home/.keep"
>>>>>>> parent of 01feca8a93 (Revert "re-enable apt")
cp -a "$STAGING_DIR/usr/include" "$TARGET_DIR/usr"
cp os-release "$TARGET_DIR/usr/lib"
printf '%s\n' '_apt:x:420:420:APT account for owning persistent & cache data:/var/lib/apt:/usr/sbin/nologin' >> "$TARGET_DIR/etc/passwd"
