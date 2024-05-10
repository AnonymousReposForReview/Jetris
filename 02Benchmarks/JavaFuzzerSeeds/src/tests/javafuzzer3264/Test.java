package tests.javafuzzer3264;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:10:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6299608259751911856L;
    public static float fFld=2.383F;
    public short sFld=520;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-119);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, int i7, int i8) {

        int i9=-36371, i10=2, i11=-34795, i12=-59100, i13=-183, i14=-37100, i15=-6, iArr[]=new int[N];
        long l=94L;
        byte by=-80;

        FuzzerUtils.init(iArr, -3);

        for (i9 = 13; i9 < 210; ++i9) {
            for (i11 = i9; i11 < 8; i11++) {
                i7 += (((i11 * Test.instanceCount) + Test.fFld) - l);
                i10 += (i11 - i10);
                iArr[i11 + 1] *= (int)Test.instanceCount;
                iArr[i9 + 1] = i7;
                for (i13 = 1; i13 < 1; i13++) {
                    double d=4.68249;
                    i12 = i15;
                    l += i6;
                    i7 += i13;
                    d -= by;
                    Test.instanceCount += (long)Test.fFld;
                    iArr[i9] += i13;
                    i15 >>= i12;
                    i10 += (int)Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i10 + i11 + i12 + l + i13 + i14 + i15 + by + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i3, int i4) {

        boolean b1=false;
        int i5=-146, i16=248, i17=1, i18=14601, iArr1[]=new int[N];
        short s=-25116;
        byte by1=-60;
        double d1=-37.61052;

        FuzzerUtils.init(iArr1, -25);

        switch ((((i4 + i3) >>> 1) % 8) + 71) {
        case 71:
            b1 = (((++i3) != (48092 - (i3--))) || b1);
            i5 = 1;
            while (++i5 < 290) {
                vMeth1(i5, 109, i4);
            }
            i3 = (int)Test.instanceCount;
            i16 = 1;
            do {
                switch ((((i3 >>> 1) % 5) * 5) + 26) {
                case 45:
                    Test.instanceCount *= Test.instanceCount;
                    break;
                case 42:
                    i3 *= i3;
                    Test.instanceCount += -37964L;
                    for (i17 = 1; i17 < 12; ++i17) {
                        i4 += i4;
                    }
                    break;
                case 29:
                    Test.instanceCount = -244;
                    break;
                case 38:
                    i18 = s;
                    Test.byArrFld[i16 + 1] <<= (byte)19498;
                case 41:
                    Test.instanceCount -= i4;
                    break;
                default:
                    iArr1[i16] -= i16;
                }
            } while (++i16 < 135);
        case 72:
            i18 += 73;
            break;
        case 73:
            i4 = (int)Test.instanceCount;
            break;
        case 74:
            i4 <<= i3;
            break;
        case 75:
            Test.fFld = Test.fFld;
        case 76:
            by1 %= (byte)(i5 | 1);
        case 77:
            d1 += -76;
            break;
        case 78:
            i3 >>>= i4;
        default:
            iArr1 = iArr1;
        }
        vMeth_check_sum += i3 + i4 + (b1 ? 1 : 0) + i5 + i16 + i17 + i18 + s + by1 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public int iMeth(boolean b) {

        int i=-2, i1=14, i2=-8, i19=-219, i20=149;
        short s1=-13445;
        double d2=-87.4221;

        for (i = 297; i > 13; i--) {
            i2 -= (i1++);
            i1 += (((i * i1) + i2) - i1);
            i2 += (13 + (i * i));
            vMeth(i2, i);
            i2 >>= i1;
            i1 -= (int)-23050L;
            s1 += (short)i;
        }
        Test.instanceCount ^= -105;
        for (i19 = 234; i19 > 11; i19 -= 2) {
            Test.instanceCount = i19;
            Test.instanceCount = (long)Test.fFld;
            i20 *= (int)d2;
            i20 += i19;
        }
        d2 -= -119;
        long meth_res = (b ? 1 : 0) + i + i1 + i2 + s1 + i19 + i20 + Double.doubleToLongBits(d2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        boolean b2=false;
        int i21=-45, i22=-125, i23=-33524, i24=-8, i25=-7, i26=-59, i27=-41, i28=-19386, i29=23250, i30=8761, i31=10,
            i32=-10, i33=-9, iArr2[]=new int[N];
        double d3=126.43675;
        float f=126.1011F, fArr[]=new float[N];
        byte by2=40;

        FuzzerUtils.init(iArr2, -18254);
        FuzzerUtils.init(fArr, 38.923F);

        iMeth(b2);
        Test.instanceCount -= Test.instanceCount;
        for (i21 = 351; 11 < i21; --i21) {
            try {
                i22 = (-54 / i21);
                i22 = (iArr2[i21] % iArr2[i21 + 1]);
                i22 = (23994 % i21);
            } catch (ArithmeticException a_e) {}
        }
        for (i23 = 14; 266 > i23; i23++) {
            d3 = sFld;
            i22 -= i22;
            for (i25 = 6; i25 < 100; i25++) {
                i27 = 1;
                while (++i27 < 2) {
                    Test.byArrFld[i23] |= (byte)sFld;
                }
                fArr[i23 - 1] = i21;
            }
            i28 = 1;
            do {
                iArr2[i23 + 1] *= i21;
                for (f = 4; f > 1; f--) {
                    Test.instanceCount >>>= i27;
                }
            } while ((i28 += 3) < 100);
            Test.instanceCount += (i23 * i23);
            d3 -= -226;
            iArr2[i23 - 1] = i25;
            i26 = i24;
            for (i30 = 3; i30 < 100; i30++) {
                i29 += (i30 + i22);
                for (i32 = 1; i32 < 2; i32++) {
                    i26 += (((i32 * i32) + f) - i23);
                    i22 += i32;
                    Test.instanceCount += by2;
                    Test.fFld -= 56582;
                    i29 = (int)Test.instanceCount;
                }
                i24 = i22;
            }
        }
        i26 >>= 35128;
        Test.instanceCount <<= Test.instanceCount;



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
