DESCRIPTION = "ROS wrapper for lely-core-libraries (native)"
AUTHOR = "Jan Vermaete"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68a0541b4c6de9b72b535745f3849b43"

inherit python_setuptools_build_meta native

DEPENDS:class-native += "lely-core-native"

SRC_URI = "\
    git://github.com/ros-industrial/ros2_canopen.git;protocol=https;branch=master \
    file://pyproject.toml \
"

SRCREV = "8b3ca27585647e3664826d2517857ca7a32617d7"

S = "${UNPACKDIR}/git/lely_core_libraries"

RDEPENDS:${PN} += "\
    lely-core \
    lely-core-native \
    python3-pyyaml-native \
"

do_configure() {
    cp ${UNPACKDIR}/pyproject.toml ${B}/pyproject.toml
}
