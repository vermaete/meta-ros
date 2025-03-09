DESCRIPTION = "Python package for lely-core"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://Makefile.am;md5=456bc2a4b86e80f31be35d526c69aec3"

PV = "2.3.2+git${SRCPV}"

SRC_URI = "\
    git://gitlab.com/lely_industries/lely-core.git;protocol=https;branch=v2.3 \
    file://pyproject.toml \
"

SRCREV = "7824cbb2ac08d091c4fa2fb397669b938de9e3f5"

S = "${UNPACKDIR}/git/python/dcf-tools"

inherit python_setuptools_build_meta native

RDEPENDS:${PN} += "\
    python3-pyyaml-native \
    python3-empy-native \
"

do_configure() {
    cp ${UNPACKDIR}/pyproject.toml ${B}/pyproject.toml
}
