SUMMARY = "RetroArch is a frontend for emulators, game engines and media players"
HOMEPAGE = "http://www.retroarch.com/"
SECTION = "emulators"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/libretro/RetroArch.git \
           file://0001-Fix-compiler_test_at_configure.patch \
	   file://0001-Fix-initializer_element_is_not_constant.patch \
	   "

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit autotools-brokensep pkgconfig

PACKAGECONFIG[openal]          = "--enable-openal,--disable-openal,openal-soft"
DEPENDS = "libx11 zlib libv4l libxkbcommon mesa freetype libxml2 ffmpeg libsdl libsdl2 libsdl pulseaudio libusb"

do_configure() {
./configure  --build=x86_64-linux --host=aarch64-poky-linux --prefix=/usr --enable-egl --enable-materialui --enable-sdl2 --enable-ffmpeg --enable-zlib
}

