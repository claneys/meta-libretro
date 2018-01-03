SUMMARY = "Standalone port/fork of Mednafen PSX to the Libretro API."
HOMEPAGE = "http://github.com/libretro/beetle-psx-libretro"
SECTION = "emulators"

LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
		    "
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/libretro/reicast-emulator.git;protocol=https \
	   "

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit autotools-brokensep

do_compile() {
    ARCH=arm make
}

do_install() {
    install -d ${D}/usr/lib/libretro
    install -m 0755 reicast_libretro.so ${D}/usr/lib/libretro
}

FILES_${PN} += " /usr/lib/libretro/reicast_libretro.so"
