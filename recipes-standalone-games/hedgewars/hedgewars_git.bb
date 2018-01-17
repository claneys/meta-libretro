SUMMARY = "Standalone Worms-like game"
HOMEPAGE = "http://www.hedgewars.org"
SECTION = "games"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=807dc99e24ea4ec1829c0d5f08233ec5 \
		    "
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/hedgewars/hw.git;protocol=https;branch=qmlfrontend"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "libsdl libpng qtbase"
