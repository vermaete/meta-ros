# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The control_box_rst package provides C++ libraries for predictive control,                 direct optimal control, optimization and simulation."
AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
ROS_AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
HOMEPAGE = "http://wiki.ros.org/control_box_rst"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv3"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "control_box_rst"
ROS_BPN = "control_box_rst"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-coinor-libipopt-dev} \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-coinor-libipopt-dev} \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-coinor-libipopt-dev} \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rst-tu-dortmund/control_box_rst-release/archive/release/noetic/control_box_rst/0.0.7-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/control_box_rst"
SRC_URI = "git://github.com/rst-tu-dortmund/control_box_rst-release;${ROS_BRANCH};protocol=https"
SRCREV = "40eacc09fb3a1ceb7e641ee0c46e55cf13b0a587"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
