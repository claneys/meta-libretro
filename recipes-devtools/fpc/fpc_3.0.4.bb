SUMMARY = "Free Pascal Compiler"
HOMEPAGE = "http://www.freepascal.org"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = "https://sourceforge.net/projects/freepascal/files/Source/3.0.4/fpcbuild-3.0.4.tar.gz"
SRC_URI[md5sum] = "255717e8e6fab4b472f7c7d0d08d2c4f"

S = "${WORKDIR}/fpcbuild-${PV}"

DEPENDS = "fpc-native"

do_compile() {
	NOGDB=1 make
}

inherit native

