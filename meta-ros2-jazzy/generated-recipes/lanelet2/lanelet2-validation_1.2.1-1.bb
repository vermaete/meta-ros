# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Package for sanitizing lanelet maps"
AUTHOR = "Fabian Immel <fabian.immel@kit.edu>"
ROS_AUTHOR = "Fabian Poggenhans <fabian.poggenhans@kit.edu>"
HOMEPAGE = "https://github.com/fzi-forschungszentrum-informatik/lanelet2.git"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "lanelet2"
ROS_BPN = "lanelet2_validation"

ROS_BUILD_DEPENDS = " \
    lanelet2-core \
    lanelet2-io \
    lanelet2-projection \
    lanelet2-routing \
    lanelet2-traffic-rules \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
    mrt-cmake-modules-native \
"

ROS_EXPORT_DEPENDS = " \
    lanelet2-core \
    lanelet2-io \
    lanelet2-projection \
    lanelet2-routing \
    lanelet2-traffic-rules \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    mrt-cmake-modules-native \
"

ROS_EXEC_DEPENDS = " \
    lanelet2-core \
    lanelet2-io \
    lanelet2-projection \
    lanelet2-routing \
    lanelet2-traffic-rules \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    lanelet2-maps \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/lanelet2-release/archive/release/jazzy/lanelet2_validation/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/lanelet2_validation"
SRC_URI = "git://github.com/ros2-gbp/lanelet2-release;${ROS_BRANCH};protocol=https"
SRCREV = "87bf0325bf0bae457a4dd104d10554118276f260"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
