SUMMARY = "Standalone port/fork of Mednafen PSX to the Libretro API."
HOMEPAGE = "http://github.com/libretro/beetle-psx-libretro"
SECTION = "emulators"

LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=6e233eda45c807aa29aeaa6d94bc48a2 \
		    "

SRC_URI = "git://github.com/libretro/beetle-psx-libretro.git;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit autotools-brokensep

do_install() {
    install -d ${D}/usr/lib/libretro
    install -m 0755 mednafen_psx_libretro.so ${D}/usr/lib/libretro
}

FILES_${PN} += " /usr/lib/libretro/mednafen_psx_libretro.so"
