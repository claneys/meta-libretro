SUMMARY = "Multi-platform Super Nintendo emulator"
HOMEPAGE = "http://www.snes9x.com/"
SECTION = "emulators"

LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://docs/snes9x-license.txt;md5=4fcf43611f2ec3b56af71326e87f5e6b \
                    file://docs/gpl-2.0.txt;md5=751419260aa954499f7abaabaa882bbe \
                    file://docs/lgpl-2.1.txt;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI = "git://github.com/libretro/snes9x2010.git;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit autotools-brokensep

DEPENDS = "libice libx11 zlib libpng libxext libsm"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
    install -d ${D}/usr/lib/libretro
    install -m 0755 snes9x2010_libretro.so ${D}/usr/lib/libretro
}

FILES_${PN} += " /usr/lib/libretro/snes9x2010_libretro.so"
