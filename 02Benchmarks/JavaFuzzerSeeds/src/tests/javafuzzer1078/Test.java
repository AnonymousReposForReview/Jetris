package tests.javafuzzer1078;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:14:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static double dFld=97.107873;
    public static byte byFld=37;
    public float fFld=-1.954F;
    public float fArrFld[]=new float[N];
    public static byte byArrFld[]=new byte[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)83);
        FuzzerUtils.init(Test.iArrFld, 107);
        FuzzerUtils.init(Test.dArrFld, 0.32140);
        FuzzerUtils.init(Test.sArrFld, (short)31534);
    }

    public static long dMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i10=-6, i11=28950;
        short s2=-11790;
        float f2=-27.835F;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2144L);

        i10 = (int)Test.instanceCount;
        Test.byArrFld[(i10 >>> 1) % N] -= (byte)Test.instanceCount;
        if (b1) {
            i10 *= s2;
            lArr[(i10 >>> 1) % N] += i10;
            i10 = i10;
            i10 -= i10;
        } else if (b1) {
            i11 = 1;
            while (++i11 < 300) {
                i10 %= -210;
                i10 += (((i11 * i10) + f2) - Test.instanceCount);
                i10 += i10;
                i10 = i11;
                if (i11 != 0) {
                    vMeth_check_sum += i10 + s2 + i11 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) +
                        FuzzerUtils.checkSum(lArr);
                    return;
                }
            }
            Test.instanceCount = -64;
            lArr = FuzzerUtils.long1array(N, (long)-2995390778L);
        }
        vMeth_check_sum += i10 + s2 + i11 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(short s1, int i3) {

        int i4=61587, i5=-31, i6=0, i8=56472, i9=3, i13=-253, i14=9478, i15=25519, i16=-12, iArr[]=new int[N];
        float f1=0.744F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, -24114);
        FuzzerUtils.init(fArr, 85.486F);

        for (i4 = 10; 304 > i4; i4 += 3) {
            int i7=-11617;
            i6 = (int)((i6--) & (-(i7 - -2814623321L)));
            for (i8 = 1; i8 < 16; i8++) {
                Test.byFld += (byte)(((--i7) * (iArr[i8 + 1]++)) - ((i3 + i9) % (((long)(f1 - i9)) | 1)));
                vMeth();
                for (i13 = i4; i13 < 2; i13++) {
                    f1 = i5;
                    Test.instanceCount += (-195 + (i13 * i13));
                    f1 -= 65328;
                }
                Test.dFld -= i5;
            }
            for (i15 = 1; i15 < 16; ++i15) {
                i7 /= (int)(i15 | 1);
            }
        }
        fArr[(i8 >>> 1) % N] += Test.byFld;
        i9 ^= s1;
        i9 += i5;
        long meth_res = s1 + i3 + i4 + i5 + i6 + i8 + i9 + Float.floatToIntBits(f1) + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static double dMeth(float f) {

        int i1=47436, i2=-34826, i17=57076, i18=-3;
        short s=30794;
        byte by=-111;
        boolean b2=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 4L);

        i1 = 1;
        do {
            s += (short)(by = (byte)((Test.dFld--) + Math.min(i1, i1)));
            i2 += (((i1 * i2) + i1) - Test.instanceCount);
            i2 = (int)lMeth(s, i1);
            lArr1[i1 + 1] -= Test.instanceCount;
            i2 += (int)Test.instanceCount;
            for (i17 = 1; i17 < 5; i17++) {
                if (true) break;
                f -= 8;
                Test.dFld = i18;
            }
            if (b2) {
                s >>>= (short)i18;
                if (i17 != 0) {
                }
                i2 = i2;
            } else if (b2) {
                i18 <<= i2;
            } else if (b2) {
                i18 += (((i1 * f) + f) - i18);
            }
        } while (++i1 < 313);
        long meth_res = Float.floatToIntBits(f) + i1 + s + by + i2 + i17 + i18 + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        boolean b=false, bArr[]=new boolean[N];
        int i=38245, i19=-8, i20=7013, i21=-710, i22=104, i23=4;
        long l=109L, l1=2025182302489452280L;
        short s3=-28630;

        FuzzerUtils.init(bArr, true);

        b = ((b = (b ^ b)) & bArr[(-5 >>> 1) % N]);
        fArrFld[(i >>> 1) % N] -= (float)Math.sqrt(dMeth(-124.828F));
        i >>= i;
        for (i19 = 10; i19 < 192; i19++) {
            for (l = 8; l < 138; ++l) {
                Test.dArrFld[(int)(l)] -= 98.92777;
                l1 = i;
                for (i22 = 2; i22 > 1; i22 -= 2) {
                    if (b) break;
                    i20 -= i19;
                    i23 = (int)Test.dFld;
                    i20 += i22;
                    fFld += l;
                    Test.instanceCount >>= i19;
                    Test.instanceCount += (-222 + (i22 * i22));
                    Test.sArrFld[i19 - 1] = (short)fFld;
                    switch ((int)((l % 10) + 31)) {
                    case 31:
                        i23 = i22;
                    case 32:
                        Test.byFld %= (byte)(i22 | 1);
                        i21 += i21;
                        if (b) continue;
                        break;
                    case 33:
                        l1 += (i22 ^ s3);
                        Test.iArrFld[i22] = Test.byFld;
                    case 34:
                        l1 -= 13L;
                        Test.iArrFld[i19 + 1] >>= (int)l1;
                        if (b) continue;
                        break;
                    case 35:
                    case 36:
                    case 37:
                        i20 ^= 9;
                        l1 <<= 9;
                        i20 += (int)l;
                        break;
                    case 38:
                    case 39:
                        i <<= (int)Test.instanceCount;
                        break;
                    case 40:
                        i -= 12;
                        break;
                    default:
                        l1 *= l;
                    }
                }
            }
        }


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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  lMeth ->  lMeth dMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
