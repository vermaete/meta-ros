# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "This package contains the color materials of common elements of PAL Robotics' robot.       The files in this package are parsed and used by       a variety of other components.  Most users will not interact directly       with this package."
AUTHOR = "Thomas Peyrucain <thomas.peyrucain@pal-robotics.com>"
HOMEPAGE = "https://github.com/pal-robotics/pal_urdf_utils"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "pal_urdf_utils"
ROS_BPN = "pal_urdf_utils"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pal-gbp/pal_urdf_utils-release/archive/release/humble/pal_urdf_utils/2.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/pal_urdf_utils"
SRC_URI = "git://github.com/pal-gbp/pal_urdf_utils-release;${ROS_BRANCH};protocol=https"
SRCREV = "ae643b3fa7df496a6437f1721914384652562153"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
